-- https://leetcode.com/problems/reformat-department-table
select *
from department
pivot (
  max(revenue) "Revenue"
  for month
  in ("Jan", 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec')
)
