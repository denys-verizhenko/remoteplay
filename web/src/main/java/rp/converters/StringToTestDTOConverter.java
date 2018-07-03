package rp.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import rp.dto.TestDTO;

@Component
@AutoRegistered
public class StringToTestDTOConverter implements Converter<String, TestDTO> {
    @Override
    public TestDTO convert(String s) {
        return new TestDTO(s, "name" + s);
    }
}
