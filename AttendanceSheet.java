public class AttendanceSheet {
    private final String[] names;
    private int count = 0;

    public AttendanceSheet(int size) {
        names = new String[size];
    }

    public void markPresent(String name) {
        if (!isPresent(name) && count < names.length) {
            names[count] = name;
            count++;
        }
    }

    public boolean isPresent(String name) {
        for (int i = 0; i < count; i++) {
            if (names[i].equals(name)) {
                return true;
            }
        }

        return false;
    }

    public int getPresentCount() {
        return count;
    }

    public static void main(String[] args) {
        AttendanceSheet sheet = new AttendanceSheet(30);

        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");

        System.out.println("Present: " + sheet.getPresentCount());
        System.out.println("Ben present: " + sheet.isPresent("Ben"));
        System.out.println("Chen present: " + sheet.isPresent("Chen"));
    }
}