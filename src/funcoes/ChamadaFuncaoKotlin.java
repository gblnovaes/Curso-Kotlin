package funcoes;

import kotlin.collections.CollectionsKt;

import java.util.ArrayList;

public class ChamadaFuncaoKotlin {
    public static void main(String[] args) {
        ArrayList<String> list = CollectionsKt.arrayListOf("Joao", "Maria", "Pedro");

        System.out.println(SegundoElementoListKt.secondOrNull(list));
    }
}
