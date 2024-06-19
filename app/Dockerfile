# Use the official Node.js image
FROM node:22
 
# Create and change to the app directory
WORKDIR /usr/src/app
 
# Install app dependencies
COPY package*.json ./
RUN npm install
 
# Copy app files
COPY . .

RUN npm init -y

RUN npm install express
 
# Expose the port the app runs on
EXPOSE 3000
 
# Run the app
CMD ["node", "app.js"]
