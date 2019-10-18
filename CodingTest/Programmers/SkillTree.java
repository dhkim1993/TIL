
/**
 * Created by kimdonghyun on 26/09/2019.
 */
class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        String[] sArr = skill.split("");
        int result=skill_trees.length;
        for(int i =0; i<skill_trees.length; i++){
            int index1 = skill_trees[i].indexOf(sArr[0]);
            for(int j =1; j<skill.length(); j++){
                int index2= skill_trees[i].indexOf(sArr[j]);
                if(index1== -1&&index2!= -1||
                        index1!= -1 && index1>index2 && index2 != -1){
                    result--;
                    break;
                }
                index1 = index2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees  = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(new SkillTree().solution(skill,skill_trees));
    }
}
