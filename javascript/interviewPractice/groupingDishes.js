function groupingDishes(dishes) {
    let flange = [], stuff = [], output = [];

    for(let i = 0; i < dishes.length; i++) {
        for(let j = 1; j < dishes[i].length; j++) {
            let tmp = [];

            for(let x = 0; x < dishes.length; x++) {
                for(let y = 1; y < dishes[x].length; y++) {
                    if(dishes[i][j] == dishes[x][y]) {
                        tmp.push(dishes[x][0]);
                    }
                }
            }

            if(tmp.length > 1 &&
            !stuff.includes(tmp) &&
            !flange.includes(dishes[i][j])) {
                flange.push(dishes[i][j]);
                stuff.push(tmp);
            }
        }
    }

    flange.sort();
    for(let i = 0; i < stuff.length; i++) {
        stuff[i].sort();

        let tmp = [];
        tmp.push(flange[i]);
        for(let j = 0; j < stuff[i].length; j++) {
            tmp.push(stuff[i][j]);
        }
        output.push(tmp);
    }

    return output;
}

let dishes = [["Salad", "Tomato", "Cucumber", "Salad", "Sauce"],
            ["Pizza", "Tomato", "Sausage", "Sauce", "Dough"],
            ["Quesadilla", "Chicken", "Cheese", "Sauce"],
            ["Sandwich", "Salad", "Bread", "Tomato", "Cheese"]];

let input = groupingDishes(dishes);

for(let i in input) {
    console.log(input[i]);
}