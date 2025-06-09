class Solution:
    def romanToInt(self, s):
        roman = {'I':1, 'V':5, 'X':10, 'L':50,
                 'C':100, 'D':500, 'M':1000}
        total, prev = 0, 0
        for ch in reversed(s):
            val = roman[ch]
            if val < prev:
                total -= val
            else:
                total += val
            prev = val
        return total

# Testing locally
if __name__ == "__main__":
    print(Solution().romanToInt("MCMXCIV"))  # Expect 1994
