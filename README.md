Original App Design Project 
===

# MyNextTrip

## Table of Contents
1. [Overview](#Overview)

This app will help you find your next travel destination by recommending popular places while also allowing you to look for a particular place following its details such as scenery, budget, time of the vacation, weather, and other variables.


2. [Product Spec](#Product-Spec)

Recommend travel destinations after user preferences.


3. [Wireframes](#Wireframes)
* Login
   * Username & password
* Main Activity
   * Allow user to find a particular place
   * Find recent trips
   * Show most popular travel options
* Detail Activity
   * Image/Youtube tour
   * Description
   * Rating
   * Budget
   * Weather
* Profile
   * Records of the user
   * Add new
* Other options?


4. [Schema](#Schema)

User recommendations after logged successfully into account. Bottom navigation view.

### Description
This app will help you find your next travel destination by recommending popular places while also allowing you to look for a particular place following its details such as scenery, budget, time of the vacation, weather, and other variables.


### App Evaluation
[Evaluation of your app across the following attributes]
- **Category:** Travel App
- **Mobile:** Movile App
- **Story:** Find your next trip
- **Market:** Travel lovers
- **Habit:** Unique recommendations and option to look for a particular place.
- **Scope:** Recommendation App

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* Login
   * Username & password
* Main Activity
   * Allow user to find a particular place
   * Find recent trips
   * Show most popular travel options
* Detail Activity
   * Image/Youtube tour
   * Description
   * Rating
   * Budget
   * Weather
* Profile
   * Records of the user
   * Add new
* Other options?


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
   * Allow user to find a particular place
   * Find recent trips
   * Show most popular travel options
* Detail Activity
   * Image/Youtube tour
   * Description
   * Rating
   * Budget
   * Weather
* Profile
   * Records of the user
   * Add new
* Other options?

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Login
* Main Activity
* Detail Activity
* More options

**Flow Navigation** (Screen to Screen)

* Login -> Main Activity
* Main Activity -> Selected Option -> Detail Activity/Profile/Other options
* Return options

## Wireframes

### [BONUS] Digital Wireframes & Mockups

### [BONUS] Interactive Prototype




## Schema 

### Models

| Property| Type | Description|
| :---: | :---: | :---: |
| objectId | String | unque identification object |
| title | String | title of the wireframe |
| weather | String | common type of weather |
| budget | String | preferred budget | 
| time | Number | preferred time to travel |
| image | File | image of the place |
| description | String | description of the place |
| rating | String | rating of the place|



### Networking
* Login 
  
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

* Google places API





- [Create basic snippets for each Parse network request]
- [OPTIONAL: List endpoints if using existing API such as Yelp]
