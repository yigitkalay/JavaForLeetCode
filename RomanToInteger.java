class Solution {
    public int romanToInt(String s) {
        int total = 0;
                int loop=s.length();
        String[] symbolValue = new String[]{"I", "1", "V", "5", "X", "10", "L", "50", "C", "100", "D", "500", "M", "1000"};
        String[] symbolValueSpecial = new String[]{"IV", "4", "IX", "9", "XL", "40", "XC", "90", "CD", "400", "CM", "900"};
        for (int j = 0; j < loop; j++) {
            for (int i = 0; i < symbolValueSpecial.length - 1; i = i + 2) {
                if (s.contains(symbolValueSpecial[i])) {
                    s = s.replaceFirst(symbolValueSpecial[i], "");
                    total = total + Integer.parseInt(symbolValueSpecial[i + 1]);
                }
            }
        }
        for (int k = 0; k < loop; k++) {
            for (int l = 0; l < symbolValue.length - 1; l = l + 2) {
                if (s.contains(symbolValue[l])) {
                    s = s.replaceFirst(symbolValue[l], "");
                    total = total + Integer.parseInt(symbolValue[l + 1]);
                }
            }
        }
        return total;
    }
}
