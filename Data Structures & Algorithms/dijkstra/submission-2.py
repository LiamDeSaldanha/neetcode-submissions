class Solution:
    def shortestPath(self, n: int, edges: List[List[int]], src: int) -> Dict[int, int]:
        adj={}
        for i in range(n):
            adj[i]=[]

        for u,v,w in edges:
            adj[u].append([v,w])
        
        shortest = {}
        minHeap = [[0,src]]

        while minHeap:
            w,n1 = heapq.heappop(minHeap)
            if n1 in shortest:
                continue
            shortest[n1] = w
            for n2,w2 in adj[n1]:
                if n2 not in shortest:
                    heapq.heappush(minHeap,[w2+w,n2])
        for i in range(n):
            if i not in shortest:
                shortest[i] = -1
        
        return shortest

