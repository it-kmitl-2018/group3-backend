# TEAM CONVENTION

Our team convention is based on **[Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)**. Please refer to it for anything that is not mentioned below.

## Naming

- Package names are all lowercase, with consecutive words (no underscore)
- Class names are written in UpperCamelCase.
- Method |  Field | Parameter and Local variable names are written in lowerCamelCase.
- Constant names use CONSTANT_CASE



## Formatting

- Block indentation 4 spaces.

- One statement per line.120 column limit.

- Indent continuation lines at least 8 spaces (from original).

- Egyptian brackets

  - Line break after the opening brace.	
  - Line break before the closing brace.
  - Line break after the closing brace. (only terminate)
  - No line break before the opening brace.


## Whitespace

### Vertical whitespace

- Between consecutive members or initializers of a class: fields | constructors | methods | nested
- Multiple consecutive blank lines are permitted, but never required

### Horizontal whitespace

- Separating any reserved word, such as if, for or catch, from an open parenthesis ( ( ) that follows it on that line
- Separating any reserved word, such as else or catch, from an closing curly braces ( } ) that follows it on that line
- On both sides of any binary or ternary operator but not on dot operator
- After ,  :  ; or the closing parenthesis of a cast ( ) )
- Between the type and variable of a declaration


## Versioning

Based on **[Semantic Versioning 2.0.0](https://semver.org/#semantic-versioning-200)**

Given a version number **MAJOR.MINOR.PATCH**, increment the:

- **MAJOR** version when you make incompatible changes  
- **MINOR** version when you add functionality in a backwards-compatible manner  
- **PATCH** version when you make backwards-compatible bug fixes.  

Additional labels for pre-release and build metadata are available as extensions to the MAJOR.MINOR.PATCH format.

## GIT commit message

we will use the following tag for each commit.

​	[**Task**] _**Commit message**_  

**Example**

​	[Add] Initial project

### Task

Start with upper letter in square bracket

- **Add**   when you create new file or directory
- **Update**   when you edit or rename existing file
- **Fix**   when you fix  a known bug. Also, in description must explain what bug is fixed
- **Delete**   when you Delete file or directory    

### Commit message

Start with upper letter and ending **without** full stop `.`

Don't commit sandwich update such as edit `.gitignore` when commit message like "[Add] Hello class"

## Reference
[Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)

[Semantic Versioning 2.0.0](https://semver.org/#semantic-versioning-200)