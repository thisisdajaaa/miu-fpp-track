package lesson6;

public class Prog1 {
    private Entry[] entries;

    public Prog1() {
        entries = new Entry[26];
    }

    public String get(char c) {
        int index = c - 'a';

        if (index >= 0 && index < 26 && entries[index] != null) {
            return entries[index].str;
        }

        return null;
    }

    public void add(char c, String s) {
        int index = c - 'a';
        System.out.println(index);
        if (index >= 0 && index < 26) {
            entries[index] = new Entry(c, s);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Entry entry: entries) {
            if (entry != null) {
                sb.append(entry.toString()).append("\n");
            }
        }

        return sb.toString();
    }


    private class Entry {
        char ch;
        String str;

        Entry(char ch, String str) {
            this.ch = ch;
            this.str = str;
        }

        public String toString() {
            return ch + "->" + str;
        }
    }

    public static void main(String[] args) {
        Prog1 t = new Prog1();
        t.add('a', "Andrew");
        t.add('b', "Billy");
        t.add('w', "Willie");
        System.out.println(t);
    }
}
