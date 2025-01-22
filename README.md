# Recipe App

## Overview

This project is a Recipe App built using Jetpack Compose, which displays a list of food categories fetched from an API. The app leverages modern Android development practices and tools for better performance, scalability, and ease of use.

## Features

Fetches a list of food categories from an API.

- Displays the categories in a visually appealing list.
- Built with Jetpack Compose for a modern UI experience.
- Efficient network communication using Retrofit.
- Seamless JSON-to-Kotlin object mapping with Gson.
- Optimized image loading using Coil Compose.

## Screenshots
![Screenshot_20250122_150458.png](../../Screenshot_20250122_150458.png)

## Dependencies

The project uses the following dependencies:

Compose ViewModel

`implementation(libs.androidx.lifecycle.viewmodel.compose)`
- Used for managing UI-related data in a lifecycle-conscious way.

### Network Calls

`implementation(libs.retrofit)`
- Facilitates making network requests to fetch data from the API.

### JSON to Kotlin Object Mapping

`implementation(libs.converter.gson)`
- Converts JSON responses from the API into Kotlin objects.

### Image Loading

`implementation(libs.coil.compose)`
- Efficiently loads and displays images from URLs.

### API Integration

The app fetches food categories from a REST API. Retrofit is used for making HTTP requests, and Gson is utilized to parse the JSON responses into Kotlin objects. 
The fetched data is then displayed in the UI using Jetpack Compose.


