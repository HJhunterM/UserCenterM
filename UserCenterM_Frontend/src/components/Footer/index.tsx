//import {GithubOutlined} from '@ant-design/icons';
import {DefaultFooter} from '@ant-design/pro-layout';
import {PLANET_LINK} from "@/constants";

const Footer: React.FC = () => {
  const defaultMessage = '暗黑考拉';
  const currentYear = new Date().getFullYear();
  return (
    <DefaultFooter
      copyright={`${currentYear} ${defaultMessage}`}
      links={[
        {
          key: 'dark',
          title: '暗黑草原',
          href: PLANET_LINK,
          blankTarget: true,
        },
        {
          key: 'link',
          title: '联系我们',
          href: 'https://www.baidu.com',
          blankTarget: true,
        },

      ]}
    />
  );
};

export default Footer;
