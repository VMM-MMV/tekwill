package src2;

class Student {
    private int id;
    private String name;
    private int score;
    
    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
    
    public int getId() { return id; }
    public int getScore() { return score; }
    
    @Override
    public String toString() {
        return String.format("Student{id=%d, name='%s', score=%d}", id, name, score);
    }
}