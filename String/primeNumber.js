function isPrime(number) {
    let isPrime = true;
  
    if (number <= 1) {
      isPrime = false;
    } else {
      for (let i = 2; i <= number-1; i++) {
        if (number % i === 0) {
          isPrime = false;
          break;
        }
      }
    }
  
    // Optionally, you can log the result or perform other actions
    if (isPrime) {
      console.log(`${number} is a prime number.`);
    } else {
      console.log(`${number} is not a prime number.`);
    }
  }
  
  // Example usage:
  const num = 5000; // Replace this with the number you want to check
  isPrime(num);



//   function isPrime(number) {
//     if (number <= 1) {
//       return false;
//     }
  
//     for (let i = 2; i <= Math.sqrt(number); i++) {
//       if (number % i === 0) {
//         return false;
//       }
//     }
  
//     return true;
//   }
  
//   // Example usage:
//   const num = 17; // Replace this with the number you want to check
//   if (isPrime(num)) {
//     console.log(`${num} is a prime number.`);
//   } else {
//     console.log(`${num} is not a prime number.`);
//   }