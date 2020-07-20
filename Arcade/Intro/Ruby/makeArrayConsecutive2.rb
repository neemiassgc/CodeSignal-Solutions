def makeArrayConsecutive2(statues)
    return (statues.min..statues.max).to_a.size - statues.size
end