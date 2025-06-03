package _32_Collections.strList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class listQuiz {
    public static void main(String[] args) {
         /* 퀴즈
        1. todoList를 담을 리스트 생성
        2. Scanner 객체 생성
        3. 사용자에게 todo 개수 count를 입력 받는다.
        4. count 만큼 반복문을 돌면서 사용자에게 todo를 입력 받아 todoList에 추가
        5. 향상된 for문으로 todoList 출력
        6. 특정 todo의 포함여부를 확인 하기 위해 searchTodo라는 변수에 찾을 키워드를 입력 받고 해당 searchTodo가 있는지 여부 출력
        7. 삭제할 todo 입력 받아서 deleteTodo에 대립해두고 포함 여부 확인 후 삭제, 성공여부 출력
        8. todo 정렬하고 전체 출력(오름차순, 내림차순)
        9. 전체 todo 개수 출력
         */

        List<String> todoList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        exit:
        while(true){
            System.out.println("=======================ToDo======================");
            System.out.println("1.입력 | 2.출력 | 3.정렬 | 4.검색 | 5.삭제 | 6.개수 | 7.종료");
            int num = sc.nextInt();
            switch (num){
                case 1 :
                    System.out.print("오늘의 todo는 몇 개 인가요?");
                    int count = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < count ; i++) {
                        System.out.print((i+1) + "번 : ");
                        String todo = sc.nextLine();
                        todoList.add(todo);
                    }
                    break;
                case 2 :
                    System.out.println("-----오늘의 todo list-----");
                    for(String todo : todoList){
                        System.out.println("- " + todo);
                    }
                    System.out.println("-------------------------");
                    break;
                case 3 :
                    System.out.print("찾고 싶은 todo가 있나요?");
                    String searchTodo = sc.nextLine();
                    boolean searchResult = todoList.contains(searchTodo);
                    System.out.println("\"" + searchTodo+"\" todo 포함 여부 : " + searchResult);
                    System.out.println();
                    break;
                case 4 :
                    System.out.println("삭제 하고 싶은 todo가 있나요?");
                    System.out.print("없다면 X를 입력하세요.");
                    String removeTodo = sc.nextLine();
                    boolean removeResult = todoList.remove(removeTodo);
                    if(!removeTodo.equals("X")){
                        System.out.println("\"" + removeTodo+ "\" todo 삭제 여부 : " + removeResult);
                    }
                    System.out.println();
                    break;
                case 5 :
                    Collections.sort(todoList);
                    System.out.println("todo list 오름차순 정렬 : " +todoList);

                    Collections.sort(todoList);
                    System.out.println("todo list 오름차순 정렬 : " +todoList);
                    break;
                case 6 :
                    System.out.println("오늘의 todo 개수 : " + todoList.size());
                    break;
                case 7 :
                    break exit;
            }
        }

        sc.close();

    }
}
