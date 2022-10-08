# Android Project 4 - *Flixster 2: Top TV Shows*

Submitted by: **Aaron Fowler**

**Top TV Shows** is a movie browsing app that allows users to see what the top shows are based on popularity.

Time spent: **8** hours spent in total

## Required Features

The following **required** functionality is completed:

- [X] **Choose any endpoint on The MovieDB API except `now_playing`**
  - Chosen Endpoint: `tv/popular`
- [X] **Make a request to your chosen endpoint and implement a RecyclerView to display all entries**
- [X] **Use Glide to load and display at least one image per entry**
- [X] **Click on an entry to view specific details about that entry using Intents**

The following **optional** features are implemented:

- [ ] **Add another API call and RecyclerView that lets the user interact with different data.** 
- [ ] **Add rounded corners to the images using the Glide transformations**
- [ ] **Implement a shared element transition when user clicks into the details of a movie**

The following **additional** features are implemented:

- None

## Video Walkthrough

Here's a [walkthrough](https://i.imgur.com/rkcGqY4.gif) of my app:

<img src="https://i.imgur.com/rkcGqY4.gif" title="Video Walkthrough" width="200px" alt="Video Walkthrough" />

GIF created with ...  
[ScreenToGif](https://www.screentogif.com/) for Windows

## Notes

I struggled with re-working the poster images compared to how to accomplished this in the lab.  After a bit of trail and error, I ended up finding a solution that displayed the images.
I am not certain if it's the database itself, or something unique in my code, but the app takes a minute or so to load.  I'd be interested in learning if there's a way to cut-off how many tv shows are loading.

## License

    Copyright [2022] [Aaron Fowler]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
