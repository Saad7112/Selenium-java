const { Builder, By, Key, until } = require('selenium-webdriver');
 
async function testHelloWorldApp() {
    let driver = await new Builder()
        .usingServer('http://localhost:4444/wd/hub')
        .forBrowser('firefox') // or 'chrome'
        .build();
 
    try {
        // Navigate to the hello world app
        await driver.get('http://hello-world-app:3000');
 
        // Get the text content of the body
        let bodyText = await driver.findElement(By.tagName('body')).getText();
 
        // Check if the text content is 'Hello World!'
        if (bodyText === 'Hello World!') {
            console.log('Test passed: Hello World! text is present');
        } else {
            console.log('Test failed: Hello World! text is not present');
        }
    } finally {
        // Quit the driver
        await driver.quit();
    }
}
 
testHelloWorldApp();