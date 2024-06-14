#!/bin/bash

# Replace with your desired URL
URL="localhost:9090/helloworld"

# Make a GET request to the URL and capture the output
RESPONSE=$(curl -s $URL)

# Check if curl command was successful
if [ $? -eq 0 ]; then
  echo "$RESPONSE"
fi
