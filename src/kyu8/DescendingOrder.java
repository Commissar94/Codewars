package kyu8;

class DescendingOrder {

    //Сортировка строки в порядке убывания
    public static int descendingOrder(int num) {

        StringBuilder sbInput = new StringBuilder();
        StringBuilder sbOutput = new StringBuilder();

        sbInput.append(num);
        int repeats = sbInput.length();

        for (int i = 0; i < repeats; i++) {
            int max = 0;
            int charToDelete = 0;
            for (int j = 0; j < sbInput.length(); j++) {
                if (Character.getNumericValue(sbInput.charAt(j)) > max) {
                    max = Character.getNumericValue(sbInput.charAt(j));
                    //запоминаем символ который удалим
                    charToDelete = j;
                }
            }
            //удаляем максимальный символ
            sbInput.deleteCharAt(charToDelete);
            sbOutput.append(max);
        }
        return Integer.parseInt(sbOutput.toString());
    }
}
