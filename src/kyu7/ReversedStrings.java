package kyu7;

class ReversedStrings {

//Просто переворачивает строку, которую получает на ввод
    private String reverseStr(String str) {
        StringBuilder sb = new StringBuilder();
        return sb.append(str).reverse().toString();
    }
}
