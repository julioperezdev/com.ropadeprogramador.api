package com.ropadeprogramador.api.scraper.infrastructure.gateway.flashcookie.getOwnProducts.response;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ParticularOwnProduct {
    public String id;
    public String name;
    public String slug;
    public String store_slug;
    public SettingsResponse settings;
    public List<String> tags;
    public String date;
}
