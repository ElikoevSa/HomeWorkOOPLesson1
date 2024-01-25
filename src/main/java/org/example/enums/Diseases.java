package org.example.enums;
//Перечисление болезней, ибо они заранее известны
public enum Diseases {
    DISEASES_LICHEN("Лишай"),
    DISEASES_FRACTURE("Перелом"),
    DISEASES_INFECTION("Инфекция"),
    DISEASES_PARASITES("Паразиты"),
    DISEASES_NONE("Отсутствует");

    private String diseasesName;

    Diseases(String diseasesName) {
        this.diseasesName = diseasesName;
    }

    public String getDiseasesName() {
        return diseasesName;
    }
}
