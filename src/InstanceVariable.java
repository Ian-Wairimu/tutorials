//instance variable have there own copy of instance variable
public class InstanceVariable {
    String variableInstance = "instance variable";

    public static void main(String[] args) {
        InstanceVariable instanceVariable = new InstanceVariable();
        InstanceVariable instanceVariable1 = new InstanceVariable();
        InstanceVariable instanceVariable2 = new InstanceVariable();

        System.out.println(instanceVariable.variableInstance);
        System.out.println(instanceVariable1.variableInstance);
        System.out.println(instanceVariable2.variableInstance);

        instanceVariable1.variableInstance = "changed instance variable";
        System.out.println(instanceVariable.variableInstance);
        System.out.println(instanceVariable1.variableInstance);
        System.out.println(instanceVariable2.variableInstance);
    }
}
