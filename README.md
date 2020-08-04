# geekbang-lessons
极客时间课程工程


# 合并 fork 的仓库发生冲突

Step 1: From your project repository, check out a new branch and test the changes.（到项目下面新建分支）
git checkout -b mercyblitz-master master

git pull https://github.com/mercyblitz/geekbang-lessons.git master

Step 2: Merge the changes and update on GitHub. （这里到idea里合并冲突 然后切到master 上push）

git checkout master
git merge --no-ff mercyblitz-master
git push origin master

#打 tag
git tag  (展示项目的所有tag版本)
git tag v1.0(tag新版本号)
git push origin v1.0(tag新版本号)

