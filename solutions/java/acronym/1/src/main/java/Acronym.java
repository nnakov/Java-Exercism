class Acronym {

    private String phrase;
    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
            StringBuilder result = new StringBuilder();

        result.append(String.valueOf(phrase.charAt(0)).toUpperCase());
        for(int i = 1; i < phrase.length(); i++) {
            char current = phrase.charAt(i);
            if(current == ' ' || current == '-' || current == '_') {
                if(phrase.charAt(i+1) != ' ' && phrase.charAt(i+1) != '-' && phrase.charAt(i+1) != '_') {
                    result.append(String.valueOf(phrase.charAt(i+1)).toUpperCase());
                }
                    
                
                
            }
        }
        return result.toString();
    }

}
