class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder stringBuild = new StringBuilder();
        int flag = 0;
        
        for(int i = 0; i < identifier.length(); i++) {
            char current = identifier.charAt(i);
            if(Character.isWhitespace(current)) {
                current = '_';
                stringBuild.append(current);
                continue;
            }
           
            if(current == '-') {
                flag++;
                continue;
            }
            if(flag == 1) {
                current = Character.toUpperCase(current);
                flag = 0;
            }

            current = switch(current) {
                case '4' -> 'a';
                case '3' -> 'e';
                case '0' -> 'o';
                case '1' -> 'l';
                case '7' -> 't';
                default -> current;
            };
            if(!Character.isLetter(current)) {
                continue;
            }
            stringBuild.append(current);
        }

        return stringBuild.toString();
    }
}
