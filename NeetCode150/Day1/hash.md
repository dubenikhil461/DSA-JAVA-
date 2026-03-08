# good hash function
- A hash function is a function that converts a key into an index.
- The hash function should be fast and should distribute keys uniformly.
- The hash function should be deterministic, i.e., the same key should always produce the same index.
- The hash function should be one-way, i.e., it should be difficult to reverse the hash function.

# Hash Table
- A hash table is a data structure that stores key-value pairs.
- The key is converted into an index using the hash function.

# collision
- when two different keys produce the same index.

# java convert linkedlist to tree after 8 nodes
if collisions create a long linked list (≥8 nodes),
Java converts it into a Red-Black Tree to improve
search from O(n) to O(log n).