# Linked List Lesson

The goal of this lesson is to learn about Linked lists, and get comfortable using testng, git and Github.  This will also involve reviews of recursion, classes/interfaces, public/private methods, and Big-O notation.

Here's whats involved:

## Set Up

0. Before any of this happens you should have created this repo, cloned it on your vm at /usr/src/projects/ and configured your git correctly like this

        git config --global user.name "John Doe"
        git config --global user.email johndoe@example.com
        
1. Start by accepting this pull request to include the lesson code in the project.
2. go to the directory for this repository on your vm and pull down the latest changes using `git pull`.
3. Start a new branch for this lesson, named linked-list or some such thing. `git checkout -b linked-list`
4. Make this repository a project in your eclipse workspace.
5. Install testNG into eclipse [See instructions here][testng] and then restart eclipse
6. run the tests in eclipse to verify that all the tests fail


## Instructions

1. Implement a linked list class that adheres to the provided interface.  It should pass all the tests in the test class.  Note that you are allowed to add other methods files or classes as needed, but the only public facing methods of the linked List class should be a constructor and the methods specified by the interface

2. Add a comment at the top of each public method specifying their efficiency for Big O (worst case), Big Theta (Average case), and Big Omega(best case)

3. When your implementation passes all the test cases and you've added comments for each method specifying the complexity then you should add and commit your changes, then push it to github.

        git add . #add all files in the repo to staging area
        git commit -m "This is an example commit" #commit with comments
        # since you've create a new branch you need to push in the form
        # git push <remote-name> <branch-name>
        # When not creating a new branch, since you will only have one remote (github) you can just say git push and then enter your github id info
        git push origin linked-list 

4. You can then create a pull-request from your branch to the master branch which I will review. (there will be a pull request button on github)


## Related Reading

If any of that seemed confusing, start by reading some of these things:

### git

- to get up and running with git it is probably helpful to read chapters 1-3 of this [free book][progit]
- or learn by practice with this [tutorial][gittutor]
- Stack Overflow also works very well as a git reference. Pretty much any "how do I ... with Git" question has been asked and answered
- If you don't want to do git on the command line, you can look into using a graphic interface like [cola][cola] to manage the repos. Might make it easier to start, and will let you see your options, but eventually will be good to know the command line versions.

### Big-O

- Read the section on run-time analysis in the Data Structures book (1.2 if the internet is to be believed)
- some good stuff [on stackoverflow](http://stackoverflow.com/questions/487258/plain-english-explanation-of-big-o)

### LinkedList

- Read the chapter on linked lists in your book (Chapter 4 I believe)

### Miscellaneous

- This lesson, the documentation for Courage, and pretty much everything you'll see on github is written in Markdown.  Its a lightweight markup language that maps directly to HTML.  The syntax details are [here][markdown].  Probably worth learning at some point, but you can just pick it up as you go too.

[testng]: http://testng.org/doc/download.html
[gittutor]: http://try.github.io/levels/1/challenges/1
[progit]: http://git-scm.com/book
[cola]: http://git-cola.github.io/downloads.html
[markdown]: http://daringfireball.net/projects/markdown/
