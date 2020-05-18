// https://leetcode.com/problems/remove-outermost-parentheses
func removeOuterParentheses(S string) string {
	var level = 0
	var result strings.Builder
    result.Grow(len(S))

	for i := 0; i < len(S); i++ {
		var c = S[i]
		if c == '(' {
			level++
			if level > 1 {
				result.WriteByte(c)
			}
		} else {
			level--
			if level > 0 {
				result.WriteByte(c)
			}
		}
	}
	return result.String()
}
