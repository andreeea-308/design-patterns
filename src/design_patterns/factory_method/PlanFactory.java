package design_patterns.factory_method;

import java.io.IOException;

/**
 * TODO: Steps to create FactoryMethod design pattern
 * 1. create a public static method called "getPlan" that gets as argument a String called type and returns a Plan
 * 2. in method body create an if-else block like follows:
 *  - if type equals "personal" return a PersonalPlan instance
 *  - else if type equals "enterprise" return a EnterprisePlan instance
 *  - else throw a RuntimeException with message "There is no Plan of given type"

 * Great job! Now you have a method factory. Let put this at work.

 * TODO: Test your code in a main method created anywhere in this package
 * 1. create a PersonalPlan using factory method. call getRate on it and print the result to console. what is printed?
 * 2. create an EnterprisePlan using factory method. call getRate on it and print the result to console. what is printed?
 * 3. spot the advantages of this pattern
 */
public class PlanFactory {
    public static Plan getPlan(String type) throws Exception {
        if (type.equals(Type.PERSONAL.name)){
            return new PersonalPlan();
        } else if (type.equals(Type.ENTERPRISE.name)){
            return new EnterprisePlan();
        } else {
            throw new Exception("There is no Plan of given type");
        }
    }
}
