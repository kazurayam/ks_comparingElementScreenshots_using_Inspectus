# Comparing Element Screenshots using Inspectus

- author: kazurayam
- date: Dec, 2023

## Problem to solve

Here I have a pair of web site:

- https://kazurayam.github.io/myApple/
- https://kazurayam.github.io/myApple-alt/

Each site has the same suppath

- page1.html
- page2.html
- page3.html
- page4.html

These pages contains an image of apple, like this:

![apple](https://kazurayam.github.io/ks_comparingElementScreenshots_using_Inspectus/images/a-bite-in-the-apple.png)

If you look at these 2 web sites and compare each pair of pages, you would notice some are the same, some are different.

- [myApple/page1.html](https://kazurayam.github.io/myApple/page1.html) vs [myApple-alt/page1.html](https://kazurayam.github.io/myApple-alt/page1.html) are the same
- [myApple/page2.html](https://kazurayam.github.io/myApple/page2.html) vs [myApple-alt/page2.html](https://kazurayam.github.io/myApple-alt/page2.html) are different
- [myApple/page3.html](https://kazurayam.github.io/myApple/page3.html) vs [myApple-alt/page3.html](https://kazurayam.github.io/myApple-alt/page3.html) are the same
- [myApple/page4.html](https://kazurayam.github.io/myApple/page4.html) vs [myApple-alt/page4.html](https://kazurayam.github.io/myApple-alt/page4.html) are different

I want to compile a report which includes the screenshots of `<img>` elements in the pages.
I want to show the report to my team and want to discuss what we should do.
