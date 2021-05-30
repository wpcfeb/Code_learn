// Function Declarations: we can call function before they are defined

function calcAge1(birthYeah) {
    return 2037 - birthYeah;
}

const age1 = calcAge1(1991);


// Function Expressions: we can not call function before they are defined
const calcAge2 = function(birthYeah) {
    return 2037 - birthYeah;
}

const age2 = calcAge2(birthYeah)

// Arrow Function
// When use Arrow Function? arrow function do not have "this" keyword
const calcAge3 = birthYeah => 2037 - birthYeah;
const age3 = calcAge3(1991)

const yearUntilRetirement = (birthYeah, firstName)=> {
    const age = 2037 - birthYeah;
    const retirement = 65 - age;
    // return retirement;
    return `${firstName} retires in  ${retirement} years`
}

console.log(yearUntilRetirement(1991, 'Jonas'))
console.log(yearUntilRetirement(1980, 'Bob'))

