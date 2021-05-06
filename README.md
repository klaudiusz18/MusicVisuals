# Music Visualiser Project

Name: Klaudiusz Nowakowski

Student Number: C19412272

## Instructions
- Fork this repository and use it a starter project for your assignment
- Create a new package named your student number and put all your code in this package.
- You should start by creating a subclass of ie.tudublin.Visual
- There is an example visualiser called MyVisual in the example package
- Check out the WaveForm and AudioBandsVisual for examples of how to call the Processing functions from other classes that are not subclasses of PApplet

# Description of the assignment
This program uses different java processing libraries to connect to the minim and make the audio from a song interact with different shapes and change colour as the song is playing. The theme of this assesement is "something beautiful to enjoy while listening to music". I was required to make a youube video demonstrating how my assignment operates which can be located down below.

# Instructions
This assignment works on a simple menu basis. Press buttons between 0 and 4 to change in between each audio visulaiser.

# How it works
When you press to run the program a song should start playing and a shape that interacts with the audio. I implemented a menu to traverse through next audio visualiser. To go to next shape you need to press on your keyboard a number between 0 to 4. You automatically start at 0, so to move onto next shape press a button between 1 and 4. When you press to move onto the next audio visualiser you should see a new shape that also interacts with the song. When you press 2, it will bring up a cube that rotates around itself. You can also press the up arrow key on your keyboard you should be able to see a duplicate being created of the cube. To exit the program press esc and it close the window and stop the music from playing. 

# What I am most proud of in the assignment
What am most proud of is implementing the cube to be there and rotate around itself. I like the way it is 3D, it creates this unique look and the way it interacts with the audio and expands looks simply looks amazing and cool. Im most proud of this because anyone can just make a simple 2D shape however making a 3D shape is more challenging cause you have to ensure all the angles are correct making it a bit more difficult, however the fact the 3D shape was a bit harder to add it made it just a bit more satisfying at the end when it worked. Also I loved the making the long audio bar that is responsive to sound and it increases when the notes get higher in the song.

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

