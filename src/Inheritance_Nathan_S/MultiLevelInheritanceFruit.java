package Inheritance_Nathan_S;

public class MultiLevelInheritanceFruit extends MultiLevelInheritanceTree {
    private String treeType;

    public MultiLevelInheritanceFruit(int age, int leaves, String type) {
       super(age, leaves) ;
        treeType = type;

    }

    public String getTreeType() {
        return treeType;
    }
    public void getAll(){
        System.out.println("Age is "+getAge());
        System.out.println("Leaves are this amount "+getNumLeaves());
        System.out.println("Type of tree is "+treeType);
    }
}

