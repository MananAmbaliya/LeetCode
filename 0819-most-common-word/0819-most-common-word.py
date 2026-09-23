class Solution:
    def mostCommonWord(self, paragraph: str, banned: list[str]) -> str:
        
        for ch in "!?',;.":
            paragraph = paragraph.replace(ch, " ")
        
        words = paragraph.lower().split()
        
        count = {}

        for word in words:
            if word not in banned:
                if word not in count:
                    count[word] = 1
                else:
                    count[word] += 1

        ans = ""
        max_count = 0

        for word in count:
            if count[word] > max_count:
                max_count = count[word]
                ans = word

        return ans