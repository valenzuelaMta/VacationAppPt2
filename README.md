Original App Design Project 
===

# MyNextTrip

## Table of Contents
1. [Overview](#Overview)

This app will let you chosee between different popular options for your next travel destination after your favored scenery, budget, time of the vacation, weather, preferred activity, and other variables to show you the top places for your next trip.


3. [Product Spec](#Product-Spec)

Recommend vacation places after user preferences.


5. [Wireframes](#Wireframes)

- Welcome & login.
- Places you have visited before.
- Budget.
- Time of vacation.
- Weather.
- Travel topics.
- Travel places.
- Recommendation feed.
- Youtube tour/guide.


7. [Schema](#Schema)

User recommendations after logged successfully into account. Bottom navigation view.

### Description
This app will let you chosee between different popular options for your next travel destination after your favored scenery, budget, time of the vacation, weather, preferred activity, and other variables to show you the top places for your next trip.


### App Evaluation
[Evaluation of your app across the following attributes]
- **Category:** Travel App
- **Mobile:** Movile App
- **Story:** Find your next trip
- **Market:** Travel lovers
- **Habit:** Personalized depending on user input
- **Scope:** Recommendation App

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* Welcome & login.
* Places you have visited before.
* Budget.
* Time of vacation.
* Weather.
* Travel topics.
* Travel places.
* Recommendation feed.
* Youtube tour/guide.


**Optional Nice-to-have Stories**

* Bottom navigation view
* Style & coloring
* Rating
* Menu button
* User can add a profile photo

### 2. Screen Archetypes

* Login
   * Username & password
* Main Activity
   * Show most popular travel options
* Option 1
   * Show top places to travel according to the user preferences
   * Image/Youtube tour
   * Description
   * Rating
* Option 2
   * Show top places to travel according to the user preferences
   * Image/Youtube tour
   * Description
   * Rating
* Option 3
   * Show top places to travel according to the user preferences
   * Image/Youtube tour
   * Description
   * Rating
* Option 4
   * Show top places to travel according to the user preferences
   * Image/Youtube tour
   * Description
   * Rating
* Additional option
   * Show top places to travel according to the user preferences
   * Image/Youtube tour
   * Description
   * Rating
* Places you have visited before
   * Records of the user
   * Add new

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Login
* Main Activity
* Selected option
* Recommendations

**Flow Navigation** (Screen to Screen)

* Login -> Main Activity
* Main Activity -> Selected Option
* Selected Option -> Access user records

## Wireframes

### [BONUS] Digital Wireframes & Mockups

### [BONUS] Interactive Prototype

![vacationApp2](https://user-images.githubusercontent.com/92124196/162827667-f79ff4f8-f304-4224-9cc5-f94a5d0d5c92.gif)


## Schema 

### Models

| Property| Type | Description|
| :---: | :---: | :---: |
| objectId | String | unque identification object |
| title | String | title of the wireframe |
| option # | Number | number of the option |
| weather | String | common type of weather |
| budget | String | preferred budget | 
| time | Number | preferred time to travel |
| image | File | image of the place |
| description | String | description of the place |
| rating | String | rating of the place|



### Networking
- Login 
  
Parse.serverURL = 'https://parseapi.back4app.com'; 
  
Parse.initialize(
  
  'ID', 
  
  'KEY' 
  
);

allprojects {
  repositories {
    ...
    maven { url "https://jitpack.io" }
  }
}
  
dependencies {
    ...
    implementation "com.github.parse-community.Parse-SDK-Android:parse:1.18.5"
}

- [Create basic snippets for each Parse network request]
- [OPTIONAL: List endpoints if using existing API such as Yelp]
