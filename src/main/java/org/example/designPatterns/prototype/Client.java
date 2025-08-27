package org.example.designPatterns.prototype;

public class Client {
    private static final String APRIL_21_BATCH = "april21Batch";
    private static final String APRIL_21_BATCH_INTELLIGENT = "aprBatchIntelligentStudent";

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student jitendra = studentRegistry.get(APRIL_21_BATCH);
        jitendra.setName("Jitendra");
        jitendra.setAge(24);
        jitendra.setStudentPsp(91.0);

        Student intelligentJitendra = studentRegistry.get(APRIL_21_BATCH_INTELLIGENT);
        intelligentJitendra.setName("Jitendra 2.0");
        intelligentJitendra.setAge(25);
        intelligentJitendra.setStudentPsp(95.0);
    }

    public static void fillRegistry(StudentRegistry studentRegistry) {
        Student aprBatchStudent = new Student();
        aprBatchStudent.setBatch("Apr 21");
        aprBatchStudent.setAverageBatchPsp(89.0);

        studentRegistry.register(APRIL_21_BATCH, aprBatchStudent);

        IntelligentStudent aprBatchIntelligentStudent = new IntelligentStudent();
        aprBatchIntelligentStudent.setIq(180);
        aprBatchIntelligentStudent.setBatch("Apr 21");
        aprBatchIntelligentStudent.setAverageBatchPsp(89.0);

        studentRegistry.register(APRIL_21_BATCH_INTELLIGENT, aprBatchIntelligentStudent);
    }
}
