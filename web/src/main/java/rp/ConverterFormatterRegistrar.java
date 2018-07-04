package rp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConverterFormatterRegistrar implements FormatterRegistrar {
    @Autowired(required = false)
    @rp.annotations.Converter
    private List<Converter> converters;

    @Override
    public void registerFormatters(FormatterRegistry formatterRegistry) {
        if (this.converters != null) {
            for (Converter converter : this.converters) {
                formatterRegistry.addConverter(converter);
            }
        }
    }
}
