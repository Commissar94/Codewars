package kyu7;

class ReversedStrings {

//Переворот строки, которая получена на ввод
    private String reverseStr(String str) {
        StringBuilder sb = new StringBuilder();
        return sb.append(str).reverse().toString();
    }
}
