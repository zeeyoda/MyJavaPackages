package Inheritance_Nathan_S;

public class MultiLevelInheritanceTree extends MultiLevelInheritancePlant {
    private int numLeaves;

    public MultiLevelInheritanceTree(int age, int leaves) {
        super(age);
        numLeaves = leaves;
    }
        public int getNumLeaves(){
            return numLeaves;
        }
    }

