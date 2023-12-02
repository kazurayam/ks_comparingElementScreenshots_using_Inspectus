# Comparing Element Screenshot using Inspectus

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

These pages contains an image of apple, like 
![apple](https://kazurayam.github.io/ks_comparingElementScreenshots_using_Inspectus/images/a-bite-in-the-apple.png)

If you compare these 2 web sites page by page, you would notice some discrepancies

- [myApple/page1.html](https://kazurayam.github.io/myApple/page1.html) vs [myApple-alt/page1.html](https://kazurayam.github.io/myApple-alt/page1.html) are the same
- [myApple/page2.html](https://kazurayam.github.io/myApple/page2.html) vs [myApple-alt/page2.html](https://kazurayam.github.io/myApple-alt/page2.html) are different; the apple is resized
- [myApple/page3.html](https://kazurayam.github.io/myApple/page3.html) vs [myApple-alt/page3.html](https://kazurayam.github.io/myApple-alt/page3.html) are the same
- [myApple/page4.html](https://kazurayam.github.io/myApple/page4.html) vs [myApple-alt/page4.html](https://kazurayam.github.io/myApple-alt/page4.html) are different; the apple is rotated

I am not going to discuss why we have those differences (I just made them intentionally).

I want to compile a report which includes the screenshot of `<img>` elements in the URLs so that others can see how the 2 web sites are different.
The report of image comparison would indicate that someone has made a silly mistakes.



