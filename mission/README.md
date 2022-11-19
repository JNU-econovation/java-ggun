# 미션 진행 방법

1. 프로젝트를 자신의 계정으로 fork합니다.
    > fork는 스프링 스터디 저장소를 자신의 계정으로 복사하는 기능입니다.

   <img width="1439" alt="Screen Shot 2022-11-19 at 8 32 24 PM" src="https://user-images.githubusercontent.com/47661695/202848677-164cf284-e38a-434b-9e7d-572060233f4c.png">


2. fork한 저장소를 자신의 컴퓨터로 clone하고 폴더로 이동합니다.
    > clone 명령은 github.com에 존재하는 저장소를 자신의 노트북 또는 PC로 복사하는 과정입니다.
    ```
   git clone https://github.com/{본인 아이디}/{저장소 아이디}.git
   ```
   ex) `git clone https://github.com/mywnajsldkf/java-ggun.git`


3. 자신의 브랜치를 생성하고 이동합니다.
    ```
   git checkout -b {본인 아이디}
   ```
   ex) `git checkout -b mywnajsldkf`


4. 기능을 구현합니다.
    미션 요구사항을 파악하고 기능을 구현합니다.


5. 기능 구현 후 `add`, `commit` 합니다.
    기능 구현을 완료한 후 로컬 저장소에 변경된 부분을 반영하기 위해 add, commit 명령어를 사용합니다.
    ```
   git status             // 변경된 파일을 확인한다.
   git add .(또는 -A)      // 변경된 전체 파일을 한번에 반영한다.
   git commit -m "메시지"  // 작업한 내용을 메시지에 기록한다.
   ```
   

6. 본인 원격 저장소에 올립니다.
    로컬에서 commit 명령을 실행하는 것은 로컬 저장소에 반영될 뿐, 원격 github.com의 저장소에는 반영되지 않습니다.
    ```
   git push origin 브랜치이름
   ```
   ex) `git push origin mywnajsldkf`


7. github 서비스에서 pull request를 보냅니다.
    > pull request는 github에서 제공하는 기능으로 코드리뷰를 요청할 때 사용합니다.

    `{자신의 github id}/java-ggun {자신의 브랜치}`에서 `eonovation/java-ggun {자신의 브랜치}`로 pull request를 보냅니다.


8. 미션에서 작업한 내용을 확인하고 `Create pull request` 버튼을 클릭해 PR 내용을 작성한 후, `Create pull request`를 눌러 제출합니다.
    ```
   title: [{미션이름}] {자신 이름} 미션 제출합니다.
   description: 알게된 내용, 고민한 점 등을 자유롭게 작성합니다.
   ```