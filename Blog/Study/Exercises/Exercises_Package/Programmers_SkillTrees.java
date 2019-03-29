package Exercises_Package;

class Programmers_SkillTrees {

    static int solution(String skill, String[] skill_trees) {
        int answer = skill_trees.length;
        for (int i = 0; i < skill_trees.length; i++) {
            int n = skill_trees[i].indexOf(skill.substring(0, 1));
            loop2:for (int j = 1; j < skill.length(); j++) {
               if( n > skill_trees[i].indexOf(skill.substring(j, j+1))){
                   answer--;
                   break loop2;
               }else{
                   n = skill_trees[i].indexOf(skill.substring(j, j+1));
               }
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA", "BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution(skill, skill_trees));
    }
}
/*
2
 */