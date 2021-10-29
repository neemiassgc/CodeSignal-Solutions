function makeArrayConsecutive2(statues) {
    const min = Math.min.apply(null, statues)
    const max = Math.max.apply(null, statues)
    
    let additionalStatues = 0
    
    for (let statue = min; statue <= max; statue++)
        if (!statues.includes(statue)) additionalStatues++
        
    return additionalStatues
}