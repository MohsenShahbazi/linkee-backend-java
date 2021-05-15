package ir.pt.diktee.resource.tools;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ir.pt.core.JPresent;

import java.util.LinkedHashMap;

/**
 * Created by Mohammadzadeh on 11/16/2019.
 */
public final class JPresentTools<T> {
    public T castToModel(JPresent jPresent) {
        LinkedHashMap listModel = (LinkedHashMap) jPresent.get();
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.convertValue(
                listModel,
                new TypeReference<T>() {
                });
    }

    public T castJDataModel(JPresent jPresent) {
        LinkedHashMap jDataModel = (LinkedHashMap) jPresent.get();
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.convertValue(
                jDataModel.get("data"),
                new TypeReference<T>() {
                });
    }

}
