class Badge {
    public String print(Integer id, String name, String department) {
        String badge = "";
        if(id != null && department != null) {
            badge = "[" + id + "]" + " - " + name + " - " + department.toUpperCase();
        } else  if(id == null && department != null) {
            badge = name + " - " + department.toUpperCase();
        } else if (id != null && department == null) {
            badge = "[" + id + "]" + " - " + name + " - " + "OWNER";
        } else {
            badge = name + " - " + "OWNER";
        }

        return badge;
    }
}
