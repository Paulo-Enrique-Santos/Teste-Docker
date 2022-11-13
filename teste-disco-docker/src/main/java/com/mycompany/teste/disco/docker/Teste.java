package com.mycompany.teste.disco.docker;

public class Teste {
    public static void main(String[] args) {
        Database database = new Database();
        
        database.getConnection().update(
                "INSERT INTO teste (dataTeste) VALUES (?)",
                "13/11/2022 - 12:16"
        );
        
        database.getBackup().update(
                "INSERT INTO teste (dataTeste) VALUES (?)",
                "13/11/2022 - 12:16"
        );
    }
}
