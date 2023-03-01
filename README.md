# Github Basics

- ## To initialize a new git repository

`git init`

# Adding files and committing changes

## To propose changes (add it to the Index) using

```git add <filename>```

```git add *``` // adds all files

## To commit these changes use

```git commit -m "Commit message"```

Now the file is committed to the HEAD, but not in your remote repository yet.

# Pushing changes to remote repository

Your changes are now in the HEAD of your local working copy. 
## To send changes to your remote repository, execute
`git push origin master`

Change master to whatever branch you want to push your changes to

## To connect to remote repository
If you have not cloned an existing repository and want to connect your repository to a remote server, you need to add it with

`git remote add origin <server>`

Now you are able to push your changes to the selected remote server

# Branching

## To create a new branch named "feature_x" and switch to it using

```git checkout -b feature_x```

## To switch back to master branch

``git checkout master``


## To delete the branch

``git branch -d feature_x``

## A branch is not available to others unless you push the branch to your remote repository

```git push origin <branch>```