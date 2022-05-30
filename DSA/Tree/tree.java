import java.util.ArrayList;

public class tree{

    static class TreeNode{
        String data;
        ArrayList<TreeNode> children;

        TreeNode(String data){
            this.data=data;
            this.children=new ArrayList<TreeNode>();
        }

        void addChild(TreeNode node){
            this.children.add(node);
        }

        String print(int level){
            String ret;
            ret = "  ".repeat(level)+data+"\n";

            for(TreeNode node: this.children){
                ret += node.print(level+1);
            }
            return ret;
        }
    }

    

    


    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode cold = new TreeNode("Cold");

        TreeNode tea = new TreeNode("Tea");
        TreeNode cofee = new TreeNode("Cofee");

        TreeNode beer = new TreeNode("Beer");
        TreeNode pepsi = new TreeNode("Pepsi");

        drinks.addChild(hot);
        drinks.addChild(cold);

        hot.addChild(tea);
        hot.addChild(cofee);

        cold.addChild(beer);
        cold.addChild(pepsi);

        System.out.println(drinks.print(0));
    }
}