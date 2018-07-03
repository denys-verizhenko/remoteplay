package rp.converters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AutoregisterFormatterRegistrar implements FormatterRegistrar {

    @Autowired(required = false)
    @AutoRegistered
    private List<Converter<?, ?>> autoRegisteredConverters;

    @Override
    public void registerFormatters(FormatterRegistry formatterRegistry) {
        if (this.autoRegisteredConverters != null) {
            for (Converter<?, ?> converter : this.autoRegisteredConverters) {
                formatterRegistry.addConverter(converter);
            }
        }
    }
}
