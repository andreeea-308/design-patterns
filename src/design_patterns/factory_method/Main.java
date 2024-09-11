package design_patterns.factory_method;

public class Main {
    public static void main(String[] args) {
        try {
            Plan planPersonal = PlanFactory.getPlan("personal");
            System.out.println(planPersonal.getRate());

            Plan planEnterprise = PlanFactory.getPlan("enterprise");
            System.out.println(planEnterprise.getRate());

            Plan notExistingPlan = PlanFactory.getPlan("kukef");
            System.out.println(notExistingPlan.getRate());

        } catch (Exception e) {
            System.out.println("doesn't found this plan for given type");
        } finally {
            System.out.println("This line is reached either an exception is trow or not!");
        }
    }
}
