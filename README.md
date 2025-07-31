# DSA Java Project

Simple Data Structures and Algorithms problems in Java. **Each file runs independently** with its own main method.

## 📁 Project Structure

```
DSA-Java-Project/
├── src/main/java/com/dsa/problems/arrays/
│   ├── TwoSum.java          # Two Sum problem
│   └── MaxSubArray.java     # Maximum Subarray problem
├── pom.xml                  # Maven configuration
└── README.md               # This file
```

## 🚀 Quick Start

### **Run Individual Problems**
```bash
# Two Sum Problem
javac -cp . src/main/java/com/dsa/problems/arrays/TwoSum.java
java -cp src/main/java com.dsa.problems.arrays.TwoSum

# Maximum Subarray Problem
javac -cp . src/main/java/com/dsa/problems/arrays/MaxSubArray.java
java -cp src/main/java com.dsa.problems.arrays.MaxSubArray
```

## 📋 Implemented Problems

### **Arrays**
1. **Two Sum** - Find two numbers that add up to target
   - HashMap Solution: O(n) time, O(n) space
   - Brute Force: O(n²) time, O(1) space

2. **Maximum Subarray** - Find subarray with largest sum
   - Kadane's Algorithm: O(n) time, O(1) space
   - Brute Force: O(n²) time, O(1) space

## 📊 Complexity Analysis

| Problem | Optimal Time | Optimal Space | Approach |
|---------|-------------|---------------|----------|
| Two Sum | O(n) | O(n) | HashMap |
| Max Subarray | O(n) | O(1) | Kadane's Algorithm |

## 🎯 GitHub Strategy

Each file is self-contained and ready for GitHub commits:

1. **Solve a problem** - Implement the algorithm
2. **Test it** - Run the main method to verify
3. **Commit** - Push to GitHub with meaningful message
4. **Repeat** - Add more problems daily

### **Example Commit Messages**
```
Add Two Sum problem with HashMap solution
- O(n) time complexity
- O(n) space complexity
- Includes test cases

Add Maximum Subarray (Kadane's Algorithm)
- O(n) time complexity  
- O(1) space complexity
- Classic DP problem
```

## 🚀 Next Steps

Add more problems to expand your GitHub portfolio:
- String problems (Palindrome, Anagram)
- Linked List problems  
- Tree/Graph problems
- Dynamic Programming
- Sorting algorithms

---

**🎉 Each file runs independently - perfect for daily GitHub commits!**
